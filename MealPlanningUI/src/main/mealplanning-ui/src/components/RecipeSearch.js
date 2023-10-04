import { Component } from 'react';
import { PropTypes } from 'prop-types';
import Autocomplete from '@mui/material/Autocomplete';
import TextField from '@mui/material/TextField';

class RecipeSearch extends Component {

    static propTypes = {
        ingredients: PropTypes.array.isRequired,
        handleChange: PropTypes.func.isRequired
    }

    onChange = (selectedIngredients) => {
        this.props.handleChange(selectedIngredients);
    }

    render()
    {
        return(<Autocomplete
        multiple
        options={this.props.ingredients}
        onChange={this.onChange}
        getOptionLabel={(option) => option}
        renderInput={(params) => (
          <TextField
            {...params}
            variant="standard"
            label="Ingredients"
            placeholder="Search Ingredients"
          />
        )}
      />);
      };
}

export default RecipeSearch;