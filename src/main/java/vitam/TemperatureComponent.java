package vitam;

import dagger.Component;

import javax.inject.Singleton;

@Component(modules = TemperatureModule.class)
@Singleton
public interface TemperatureComponent {

    TemperatureResource findTemperature();
}
