package RMI;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

//远程服务对象，负责接口的实现
public class MyRemoteImpl extends UnicastRemoteObject implements IMyRemote {

    //设计一个空的构造函数，抛出RemoteException异常
    public MyRemoteImpl() throws RemoteException {};

    //接口的实现
    @Override
    public String sayHello() throws RemoteException {
        return "Server says, 'Hey'";
    }
}
