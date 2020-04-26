package crc6436929b8ad3b40f6f;


public class ImageCircleRenderer
	extends crc643f46942d9dd1fff9.ImageRenderer
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_drawChild:(Landroid/graphics/Canvas;Landroid/view/View;J)Z:GetDrawChild_Landroid_graphics_Canvas_Landroid_view_View_JHandler\n" +
			"";
		mono.android.Runtime.register ("ImageCircle.Forms.Plugin.Droid.ImageCircleRenderer, ImageCircle.Forms.Plugin", ImageCircleRenderer.class, __md_methods);
	}


	public ImageCircleRenderer (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == ImageCircleRenderer.class)
			mono.android.TypeManager.Activate ("ImageCircle.Forms.Plugin.Droid.ImageCircleRenderer, ImageCircle.Forms.Plugin", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public ImageCircleRenderer (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == ImageCircleRenderer.class)
			mono.android.TypeManager.Activate ("ImageCircle.Forms.Plugin.Droid.ImageCircleRenderer, ImageCircle.Forms.Plugin", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public ImageCircleRenderer (android.content.Context p0)
	{
		super (p0);
		if (getClass () == ImageCircleRenderer.class)
			mono.android.TypeManager.Activate ("ImageCircle.Forms.Plugin.Droid.ImageCircleRenderer, ImageCircle.Forms.Plugin", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public boolean drawChild (android.graphics.Canvas p0, android.view.View p1, long p2)
	{
		return n_drawChild (p0, p1, p2);
	}

	private native boolean n_drawChild (android.graphics.Canvas p0, android.view.View p1, long p2);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
