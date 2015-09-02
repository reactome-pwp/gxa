package uk.ac.ebi.pwp.widgets.gxa.ui;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * @author Antonio Fabregat <fabregat@ebi.ac.uk>
 */
class AtlasHeatmapModule extends JavaScriptObject {

    protected AtlasHeatmapModule() {
    }

    public static native AtlasHeatmapModule build(String baseUrl, String placeHolder, String uniprotID) /*-{
        var AtlasHeatmapBuilder = $wnd.window.exposed;
        AtlasHeatmapBuilder({
            gxaBaseUrl  : 'http://www.ebi.ac.uk/gxa/',
            params      : 'geneQuery=' + uniprotID,
            isMultiExperiment: false,
            target      : placeHolder
        });
    }-*/;


}
