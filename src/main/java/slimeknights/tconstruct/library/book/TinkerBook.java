package slimeknights.tconstruct.library.book;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import slimeknights.mantle.client.book.BookLoader;
import slimeknights.mantle.client.book.data.BookData;
import slimeknights.mantle.client.book.repository.FileRepository;
import slimeknights.tconstruct.common.ClientProxy;
import slimeknights.tconstruct.library.Util;

@SideOnly(Side.CLIENT)
public class TinkerBook extends BookData {

  public final static BookData INSTANCE = BookLoader.registerBook(Util.RESOURCE, true, true);

  static {
    BookLoader.registerPageType(ContentMaterial.Tool.ID, ContentMaterial.Tool.class);
    INSTANCE.addRepository(new FileRepository(Util.resource("book")));
    INSTANCE.addTransformer(new MaterialSectionTransformer());
    INSTANCE.addTransformer(new ModifierSectionTransformer());
  }
}
