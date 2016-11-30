package vitam;

import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;
import java.nio.file.Paths;

@Module
public class TemperatureModule {

    @Provides
    @Singleton
    public FileRepository createFileRepository() {
        return new FileRepository(Paths.get("/Users/jean-eudes/tmp/temp.txt"));
    }

}
