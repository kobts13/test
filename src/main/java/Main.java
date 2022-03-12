import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Interaction;
import model.Item;
import model.Party;
import model.Source;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper()
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        Interaction interaction1 = new Interaction();
        Party party = new Party();
        party.setId("111");
        party.setA("aaa");
        party.setB("bbb");
        interaction1.setAfter(party);
        Source source1 = new Source();
        source1.setTable("party");
        interaction1.setSource(source1);

        Interaction interaction2 = new Interaction();
        Item item = new Item();
        item.setId("222");
        item.setD("ddd");
        item.setE("eee");
        interaction2.setAfter(item);
        Source source2 = new Source();
        source2.setTable("item");
        interaction2.setSource(source2);

        List<Interaction> interactions = List.of(interaction1, interaction2);

        mapper.writeValue(new File("target/interaction.json"), interactions);

        List<Interaction> result = mapper.readValue(new File("target/result.json"), new TypeReference<>() {
        });
        System.out.println(result);
    }
}
