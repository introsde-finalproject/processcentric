package introsde.finalproject.processcentric;

import introsde.finalproject.businesslogic.BusinessLogicService;
import introsde.finalproject.storage.StorageService;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import javax.jws.WebService;

@WebService(endpointInterface = "introsde.finalproject.processcentric.Service", serviceName="ProcessCentricService")
public class ServiceImpl implements Service {

    private static final StorageService storageService = new StorageService();
    private static final BusinessLogicService businessLogicService = new BusinessLogicService();
    
    @Override
    public List<String> getUserNotifications(Long id) {
        return businessLogicService.getServiceImplPort().getUserNotifications(id);
    }
    
    @Override
    public List<String> getUserGoals(Long id) {
        return storageService.getServiceImplPort().getUserGoals(id);
    }
    
    @Override
    public List<String> getUserInfo(Long id) {
        return storageService.getServiceImplPort().getUserInfo(id);
    }
    
    @Override
    public List<String> getUserMeasureHistory(Long id) {
        return storageService.getServiceImplPort().getUserMeasureHistory(id);
    }
    
    @Override
    public String updateUserInfo(Long id, String key, String value) {
        return businessLogicService.getServiceImplPort().updateUserInfo(id, key, value);
    }
    
    @Override
    public String updateUserGoal(Long id, String goal, String value) {
        return businessLogicService.getServiceImplPort().updateUserGoal(id, goal, value);
    }
    
    @Override
    public String deleteUserGoal(Long id, String goal) {
        return businessLogicService.getServiceImplPort().deleteUserGoal(id, goal);
    }
    
    @Override
    public String updateGoalProgress(Long id, String goal, String value) {
        return businessLogicService.getServiceImplPort().updateGoalProgress(id, goal, value);
    }

}
