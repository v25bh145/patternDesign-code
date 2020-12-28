package RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

//远程接口
public interface IMyRemote extends Remote {
    //记得抛出网络异常RemoteException
    //返回值必须是primitive OR Serializable(原语或可序列化，这里String属于可序列化类型)
    public String sayHello() throws RemoteException;
}
