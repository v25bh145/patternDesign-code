package self.subject;

import self.observer.IObserver;

public interface ISubject {
    public void registerObserver(IObserver o);
    public void deleteObserver(IObserver o);
    public void notifyObservers();
}
