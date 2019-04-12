package net.dataoriented.juju.oinpuser;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import net.dataoriented.juju.onipuser.OnipUserApplication;
import net.dataoriented.juju.onipuser.entity.OnipUser;
import net.dataoriented.juju.onipuser.mapper.OnipUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = OnipUserApplication.class)
@Transactional
@Rollback
public class OnipUserApplicationTest {

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private OnipUserMapper onipUserMapper;

    @Test
    public void testInsert() {
        OnipUser onipUser = new OnipUser();
        //onipUser.setOinpuserid(new Integer(3));
        onipUser.setEmail("qqq@yahoo.com");
        onipUser.setFirstname("Lusifer");
        onipUser.setLastname("Ye");
        onipUser.setWechatid("abc");
        onipUser.setUsergroup("F");
        onipUser.setCreation(new Date());
        onipUser.setStartdate(new Date());
        onipUser.setEnddate(new Date());


        onipUserMapper.insert(onipUser);
    }

    @Test
    public void testDelete() {
        //DELETE from tb_user WHERE username = 'Lusifer'
        Example example = new Example(OnipUser.class);
        example.createCriteria().andEqualTo("firstname", "Lusifer");

        onipUserMapper.deleteByExample(example);
    }

    @Test
    public void testUpdate() {
        Example example = new Example(OnipUser.class);
        example.createCriteria().andEqualTo("firstname", "Lusifer");

        OnipUser onipUser = new OnipUser();
        onipUser.setEmail("qqq@yahoo.com");
        onipUser.setFirstname("LusiferNEWWWW");
        onipUser.setLastname("Ye");
        onipUser.setWechatid("abc");
        onipUser.setUsergroup("F");
        onipUser.setCreation(new Date());
        onipUser.setStartdate(new Date());
        onipUser.setEnddate(new Date());

        onipUserMapper.updateByExample(onipUser, example);
    }


    @Test
    public void testSelect() {
        List<OnipUser> oinpUsers = onipUserMapper.selectAll();
        for (OnipUser oinpUser : oinpUsers) {
            System.out.println(oinpUser.getEmail());
        }
    }

    @Test
    public void testPage() {
        // PageHelper pageNume and recordsPerPage
        PageHelper.startPage(0, 2);

        Example example = new Example(OnipUser.class);
        PageInfo<OnipUser> pageInfo = new PageInfo<>(onipUserMapper.selectByExample(example));

        // query the resultset
        List<OnipUser> oinpUsers = pageInfo.getList();
        for (OnipUser oinpUser : oinpUsers) {
            System.out.println(oinpUser.getEmail());
        }
    }
}
