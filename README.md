# PDBe Widget
Shows a summary of the gene expression data available in Gene Expression Atlas (GXA)

<img src="gxa-example.png " align="center" alt="pdb widget example">

## How to use the widget?

First add EBI Nexus repository in your pom.xml file

    <repositories>
        ...
        <!-- EBI repo -->
        <repository>
            <id>nexus-ebi-repo</id>
            <name>The EBI internal repository</name>
            <url>http://www.ebi.ac.uk/Tools/maven/repos/content/groups/ebi-repo/</url>
            <releases>
                <enabled>true</enabled>
            </releases>
            <snapshots>
                <enabled>false</enabled>
            </snapshots>
        </repository>
        <!-- EBI SNAPSHOT repo -->
        <repository>
            <id>nexus-ebi-snapshot-repo</id>
            <name>The EBI internal snapshot repository</name>
            <url>http://www.ebi.ac.uk/Tools/maven/repos/content/groups/ebi-snapshots/</url>
            <releases>
                <enabled>false</enabled>
            </releases>
            <snapshots>
                <enabled>true</enabled>
            </snapshots>
        </repository>
    </repositories>

Then add the pdbe dependency

    <dependencies>
        ...
        <dependency>
            <groupId>uk.ac.ebi.pwp.widgets</groupId>
            <artifactId>gxa</artifactId>
            <version>2.3.0</version>
        </dependency>
    <dependencies>
    
In your project main html file add the following pdbe javascript dependencies

    <!--GXA dependencies-->
    <script language="JavaScript" type="text/javascript" src="http://www.ebi.ac.uk/gxa/resources/js-bundles/vendor.bundle.js"></script>
    <script language="JavaScript" type="text/javascript" src="http://www.ebi.ac.uk/gxa/resources/js-bundles/expression-atlas-heatmap.bundle.js"></script>
    
The GXA panel can be created as follows and then placed in the right place-holder  
  
    GXAViewer gxaViewer = new GXAViewer();
    gxaViewer.setReactomeID("R-HSA-69580");
