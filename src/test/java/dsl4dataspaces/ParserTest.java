package dsl4dataspaces;



import dsl4dataspaces.dsl4dataspaces._ast.ASTDataSpaceConnectorConfiguration;
import dsl4dataspaces.dsl4dataspaces._parser.DSL4DataspacesParser;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Optional;

public class ParserTest {

    @Test
    public void testCarModel() throws IOException {
        DSL4DataspacesParser parser = new DSL4DataspacesParser();
        Optional<ASTDataSpaceConnectorConfiguration> parse = parser.parse("src/test/resources/parser/valid/InnoWindow.dsc");
        Assert.assertTrue(parse.isPresent());
    }
}