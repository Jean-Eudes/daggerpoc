package vitam;

import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {TemperatureModule.class})
public interface TemperatureComponent {

    TemperatureResource loadTemperatureResource();

}
