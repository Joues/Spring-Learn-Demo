package annotation.dao;

import org.springframework.stereotype.Repository;

@Repository("testDao")
/**
 * 相当于@Repository，但如果在service层中使用@Resource(name="testDao"),
 * testDao不能省略
 */
public class TestDaoImpl implements TestDao {
    @Override
    public void save() {
        System.out.println("testDao save");
    }
}
