import * as React from 'react';
import SvgIcon from '@mui/material/SvgIcon';
import Typography from '@mui/material/Typography';
import Stack from '@mui/material/Stack';

export default function Recipe() {
  var recipes = ['Recipe1', 'Recipe2', 'Recipe3'];

  return (
    <Typography sx={{ mt: 6, mb: 3 }} color="text.secondary">
        <Stack spacing = {2}>
            {recipes.map(recipe => <div>{recipe}</div>)}
        </Stack>
    </Typography>
  );
}