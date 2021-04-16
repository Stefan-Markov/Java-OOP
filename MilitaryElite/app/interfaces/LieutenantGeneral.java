package MilitaryElite.app.interfaces;


import MilitaryElite.app.PrivateImpl;

import java.util.List;

public interface LieutenantGeneral {

    void addPrivate(PrivateImpl priv);

    List<PrivateImpl> getPrivates();

}
