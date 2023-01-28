package Model;

public interface Service {
    public void addConteragent(String agentName);
    public void removeConteragent(String agentName);
    public void addContactService(String agentName, int contactNum, String contactValue);
    public void removeContactService(String agentName, int contactNum, String contactValue);
}
