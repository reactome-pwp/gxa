package uk.ac.ebi.pwp.widgets.gxa.ui;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * @author Antonio Fabregat <fabregat@ebi.ac.uk>
 */
class AtlasHeatmapModule extends JavaScriptObject {

    static {
        init();
    }

    protected AtlasHeatmapModule() {
    }

    private static native void init() /*-{
        AtlasHeatmapBuilder = $wnd.window.exposed;
    }-*/;

    public static native AtlasHeatmapModule build(String placeHolder, String uniprotID) /*-{
        AtlasHeatmapBuilder({
            gxaBaseUrl: 'http://www.ebi.ac.uk/gxa/',
            params: 'geneQuery=' + uniprotID,
            isMultiExperiment: false,
            target: placeHolder
        });
    }-*/;


}
