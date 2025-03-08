import {
  HStack,
  Image,
  Input,
  InputGroup,
  InputLeftElement,
  Button
} from "@chakra-ui/react";
import { SearchIcon } from "@chakra-ui/icons";
import logo from "../assets/logo.png"
import { Menu, MenuButton, MenuList, MenuItem } from "@chakra-ui/react";
import {
  IconButton,
  HamburgerIcon
} from "@chakra-ui/icons";
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'
import { faUserGroup,faHeart, faHouse,faClock, faUsers, faFire, faPen, faTags, faCartShopping, faGear, faUser, faRightFromBracket } from '@fortawesome/free-solid-svg-icons'
import DarkSwitch from "./DarkSwitch";

function Header() {
  return (
    <>
      <HStack justifyContent="center" alignItems="center" >
        <Menu>
          <MenuButton
            as={IconButton}
            aria-label="Options"
            textColor="white"
            icon={<HamburgerIcon />}
            variant="outline"
          />
          <MenuList>
            <MenuItem icon={<FontAwesomeIcon icon={faHouse} style={{color: "#B197FC",}} />}>
              Home
            </MenuItem>
            <MenuItem icon={<FontAwesomeIcon icon={faClock} style={{color: "#B197FC",}} />}>
              Recently Played
            </MenuItem>
            <MenuItem icon={<FontAwesomeIcon icon={faUsers} style={{color: "#B197FC",}} />}>
              Multiplayer
            </MenuItem>
            <MenuItem icon={<FontAwesomeIcon icon={faFire} style={{color: "#B197FC",}} />}>
              Trending Now..
            </MenuItem>
            <MenuItem icon={<FontAwesomeIcon icon={faPen} style={{color: "#B197FC",}} />}>
              Updated
            </MenuItem>
            <MenuItem icon={<FontAwesomeIcon icon={faTags} style={{color: "#B197FC",}} />}>
              Tags
            </MenuItem>
            <MenuItem icon={<FontAwesomeIcon icon={faCartShopping} style={{color: "#B197FC",}} />}>
              Cart
            </MenuItem>
            <MenuItem icon={<FontAwesomeIcon icon={faGear} style={{color: "#B197FC",}} />}>
              Setting
            </MenuItem>
            <MenuItem icon={<FontAwesomeIcon icon={faUser} style={{color: "#B197FC",}} />}>
              My Account
            </MenuItem>
            <MenuItem icon={<FontAwesomeIcon icon={faRightFromBracket} style={{color: "#B197FC",}} />}>
              Log Out
            </MenuItem>
          </MenuList>
        </Menu>
        <Image src={logo} boxSize={"100px"}></Image>
        <InputGroup borderRadius="full" w="70%">
          <InputLeftElement pointerEvents="none">
            <SearchIcon color="gray.300" />
          </InputLeftElement>
          <Input
            type="text"
            size="md"
            focusBorderColor="white"
            width="600px"
            placeholder="What are you looking for? "
          />
        </InputGroup>
        <IconButton aria-label="Search database" colorScheme="white" variant="solid" isRound={true} icon={<FontAwesomeIcon icon={faUserGroup} />} />
        <IconButton aria-label="Search database"  colorScheme="white" variant="solid" isRound={true} icon={<FontAwesomeIcon icon={faHeart} />} />
        <Button colorScheme='gray' variant='solid'>
    Log in 
  </Button>
  <DarkSwitch></DarkSwitch>
      </HStack>
    </>
  );
}
export default Header;
