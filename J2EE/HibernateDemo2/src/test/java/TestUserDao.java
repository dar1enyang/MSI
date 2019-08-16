import com.mercury.beans.User;
import com.mercury.daos.UserDao;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

/**
 * @program: HibernateDemo2
 * @description:
 * @author: yangdar1en
 * @create: 2019-08-15 16:28
 **/

public class TestUserDao {
    private UserDao ud;

    @Before
    public void setUp() throws Exception {
        // @Before
        // the function will be executed once per test case (1 / test case)
        ud = new UserDao();

        System.out.println("***********");
    }

    @Ignore
    public void save() {
        User user = new User("Dog", 4);
        ud.save(user);

        User temp = ud.getByName("Dog");
        Assert.assertEquals(user, temp);
    }

    @Ignore
    public void getAll() {
        List<User> users = ud.getAll();
        Assert.assertEquals(6, users.size());
    }

    @Test
    public void getByName() {
        String name = "Billy";
        int age = 92;

        User user = ud.getByName(name);

        // this function success only if user.getAge() == age
        Assert.assertEquals(age, user.getAge());
    }

    @Ignore
    public void deleteByName() {
    }
}
