package annotation.service;

import annotation.dao.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("testService")  //相当于@Service
public class TestSerivceImpl implements TestService {
//    @Resource(name="testDao")
    @Autowired
//    相当于@Autowired，@Autowired默认按照Bean状态装配
    private TestDao testDao;

    @Override
    public void save() {
        testDao.save();
        System.out.println("testService save");
    }
}
