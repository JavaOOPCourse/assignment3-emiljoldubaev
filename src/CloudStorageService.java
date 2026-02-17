public class CloudStorageService extends Service
        implements PremiumFeature, Billable {


    // TODO: declare premium field
    private boolean premium;

    
    // TODO: constructor
    public CloudStorageService(String serviceName,int serviceId){
        super(serviceName,serviceId);
        this.premium=false;
        
    }

    @Override
    public void performService() {

        // TODO:
        // check if active
        // print cloud access message
        if (this.getIsActive()){
            System.out.println("cloud access");
        }
        

    }

    @Override
    public void upgradeToPremium() {

        // TODO:
        // enable premium
        // print message
        this.premium=true;
        System.out.println("premium enabled");

    }

    @Override
    public void generateBill() {
        System.out.println("billed ");
        // TODO:
        // print billing message

    }
}