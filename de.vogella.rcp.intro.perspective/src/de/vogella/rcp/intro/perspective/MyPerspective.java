package de.vogella.rcp.intro.perspective;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class MyPerspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
	    layout.setEditorAreaVisible(false);
	    layout.setFixed(true);
	    layout.addStandaloneView(View.ID,  true, IPageLayout.LEFT, 1.0f, editorArea);
	}

}