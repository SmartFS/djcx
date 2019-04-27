package cn.sicau.djcx.entity;

public class TestBase {
    public static void main(String[] args) {
        User user = new User();
        user.setPassword("fangsheng");
        user.setAccount("13419171272");
        System.out.println(user.getAccount()+"======"+user.getPassword());
    }
}
