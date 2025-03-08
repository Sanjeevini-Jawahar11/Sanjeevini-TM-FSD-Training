import {
  Card,
  CardBody,
  CardFooter,
  Image,
  Stack,
  Heading,
  Text,
  Divider,
  Button,
  ButtonGroup,
  HStack,
} from "@chakra-ui/react";
import Marquee from "react-fast-marquee";
interface Props{
    imagePic:string;
    imageName:string;
    imageDesc:string;
    imagePrice:string;

}
function GameCards({imagePic,imageName,imageDesc,imagePrice}:Props) {
  return (
    <>
   
      <Card maxW="-webkit-min-content" bgColor="pink">
        <CardBody>
          <Image
            src={imagePic}
            alt="Green double couch with wooden legs"
            borderRadius="lg"
          />
          <Stack mt="6" spacing="3">
            <Heading size="md">{imageName}</Heading>
            <Text>
            {imageDesc}
            </Text>
            <Text color="blue.600" fontSize="2xl">
              {imagePrice}
            </Text>
          </Stack>
        </CardBody>
        <Divider />
        <CardFooter>
          <ButtonGroup spacing="2">
            <Button variant="solid" colorScheme="purple">
              Buy now
            </Button>
            <Button variant="ghost" colorScheme="purple">
              Add to cart
            </Button>
          </ButtonGroup>
        </CardFooter>
      </Card>
    </>
  );
}
export default GameCards;
