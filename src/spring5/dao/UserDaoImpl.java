package spring5.dao;

public class UserDaoImpl implements UserDao{//接口的实现类
    @Override
    public void update() {
        System.out.println("dao update");
    }
}
