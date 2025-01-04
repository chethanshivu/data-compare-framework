package automation.data.compare.keyprovider;


import automation.data.compare.datacomponents.FileAComponents;

public class Env1FileACompareKeyProvider implements CompareKeyProvider<FileAComponents>{


    @Override
    public String CreateKey(FileAComponents dataComponents) {
        return dataComponents.getEeid()
                + "$" + dataComponents.getDepartment()
                + "$" + dataComponents.getJobTitle()
                + "$" + dataComponents.getHireDate();
    }
}
