package fisherman77.zeuscraft.common.blocks;

import java.util.Random;

import fisherman77.zeuscraft.common.Zeuscraft;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class BlockMarble extends Block
{
        public BlockMarble(int par1)
        {
                super(par1, Material.rock); //You can set different materials, check them out!
                this.setCreativeTab(Zeuscraft.tabZeuscraft);
        }
        public void registerIcons(IconRegister iconRegister)
        {
                blockIcon = iconRegister.registerIcon("zeuscraft:Marble");//Telling Forge where our texture is
        }
        public int idDropped(int i, Random random, int j)
        {
                return Zeuscraft.Marble.blockID;
        }
        public int quantityDropped(Random random)
        {
                return 1;
        }
}