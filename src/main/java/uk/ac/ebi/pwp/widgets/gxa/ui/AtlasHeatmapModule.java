package uk.ac.ebi.pwp.widgets.gxa.ui;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * @author Antonio Fabregat <fabregat@ebi.ac.uk>
 */
class AtlasHeatmapModule extends JavaScriptObject {

    protected AtlasHeatmapModule() {
    }

    public static native AtlasHeatmapModule build(String placeHolder, String uniprotID) /*-{
        $wnd.expressionAtlasHeatmapHighcharts.render({
            params: 'geneQuery=' + uniprotID,
            isMultiExperiment: false,
            target: placeHolder
        });
    }-*/;


}
