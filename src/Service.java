public abstract class Service {
    private String serviceName;
    private int serviceId;
    private boolean isActive;
    // TODO: declare private fields
    // serviceName
    // serviceId
    // isActive

    
    // TODO: constructor
    public Service(String serviceName,int serviceId2){
        this.serviceName=serviceName;
        this.serviceId=serviceId2;
        this.isActive=false;
    }


    // TODO: activateService()
    // should set isActive = true
    // print activation message
    public void activateService(){
        this.isActive=true;
        System.out.println("Activated");
    }




    // TODO: deactivateService()
    // should set isActive = false
    // print deactivation message
    public void deactivateService(){
        this.isActive=false;
        System.out.println("deactivated");
    }
    


    // TODO: getter for serviceName
    public String getServiceName(){
        return serviceName;
    }

    // TODO: getter for isActive
    public boolean getIsActive(){
        return isActive;
    }

    // TODO: abstract method performService()
    public abstract void performService();

    

}