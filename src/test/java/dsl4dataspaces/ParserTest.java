package dsl4dataspaces;



import dsl4dataspaces.dsl4dataspaces._ast.ASTDataSpaceConnectorConfiguration;
import dsl4dataspaces.dsl4dataspaces._parser.DSL4DataspacesParser;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;
import java.util.Optional;

public class ParserTest {

    @Test
    public void testDataSpaceModel() throws IOException {
        DSL4DataspacesParser parser = new DSL4DataspacesParser();
        Optional<ASTDataSpaceConnectorConfiguration> parse = parser.parse("src/test/resources/parser/valid/InnoWindow2.dsc");
        Assert.assertTrue(parse.isPresent());
    }
}