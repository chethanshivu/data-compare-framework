package automation.data.compare.keyprovider;

import automation.data.compare.datacomponents.BaseDomainComponents;

public interface CompareKeyProvider<T extends BaseDomainComponents> {

    String CreateKey(T dataComponents);
}
