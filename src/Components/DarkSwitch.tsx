import { HStack, Switch, useColorMode } from "@chakra-ui/react";

function DarkSwitch(){
    let {colorMode,toggleColorMode}=useColorMode();
    return(
        <HStack>
            <Switch colorScheme="purple" isChecked={colorMode=='dark'} onChange={toggleColorMode}>
            </Switch>
        </HStack>

)
}
export default DarkSwitch;