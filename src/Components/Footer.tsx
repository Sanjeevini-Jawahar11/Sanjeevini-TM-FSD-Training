import { Box, Text, HStack, IconButton, Link } from "@chakra-ui/react";
import { FaFacebook, FaTwitter, FaInstagram, FaLinkedin } from "react-icons/fa";

function Footer() {
  return (
    <Box bg="black" color="white" py={4} textAlign="center">
      <HStack justify="center" spacing={5} mb={2}>
        <Link href="https://facebook.com" isExternal>
          <IconButton aria-label="Facebook" icon={<FaFacebook />} colorScheme="blue" variant="ghost" />
        </Link>
        <Link href="https://twitter.com" isExternal>
          <IconButton aria-label="Twitter" icon={<FaTwitter />} colorScheme="twitter" variant="ghost" />
        </Link>
        <Link href="https://instagram.com" isExternal>
          <IconButton aria-label="Instagram" icon={<FaInstagram />} colorScheme="pink" variant="ghost" />
        </Link>
        <Link href="https://linkedin.com" isExternal>
          <IconButton aria-label="LinkedIn" icon={<FaLinkedin />} colorScheme="linkedin" variant="ghost" />
        </Link>
      </HStack>
      <Text fontSize="sm">© {new Date().getFullYear()} GameZone. All Rights Reserved.</Text>
    </Box>
  );
}

export default Footer;
