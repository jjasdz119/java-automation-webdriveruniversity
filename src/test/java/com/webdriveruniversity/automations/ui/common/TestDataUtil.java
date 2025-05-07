import org.yaml.snakeyaml.Yaml;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import org.junit.jupiter.params.provider.Arguments;

public class TestDataUtil {
    private static Map<String, Object> testData;

    static {
        Yaml yaml = new Yaml();
        try (InputStream in = TestDataUtil.class.getResourceAsStream("/config.yaml")) {
            testData = yaml.load(in);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load test data", e);
        }
    }

    public static Stream<Arguments> provideInvalidEmails() {
        return ((List<String>) testData.get("invalidEmails")).stream()
                .map(Arguments::of);
    }

    public static Stream<Arguments> provideInvalidData() {
        return ((List<Map<String, String>>) testData.get("invalidData")).stream()
                .map(data -> Arguments.of(
                        data.get("firstName"),
                        data.get("lastName"),
                        data.get("email"),
                        data.get("comments")));
    }

    public static Map<String, String> getValidData() {
        return (Map<String, String>) testData.get("validData");
    }
}