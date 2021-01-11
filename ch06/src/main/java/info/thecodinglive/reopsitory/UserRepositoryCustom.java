package info.thecodinglive.reopsitory;

import java.util.List;

public interface UserRepositoryCustom {
    List findAddLike(String keyword);

    int maxAge();

    int minAge();
}
